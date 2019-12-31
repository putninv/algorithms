package com.company.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CourseSchedule {
    LinkedList<Integer> graph[] ;
    Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0){
            return true;
        }

        graph = new LinkedList[numCourses];

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int[] edge : prerequisites) {
            graph[edge[0]].add(edge[1]);
        }

        for(int i = 0; i < numCourses; i++) {
            if(visit(i)){
                return false;
            }
        }

        return true;
    }

    private boolean visit(int vertex) {
        visited.add(vertex);

        LinkedList list = graph[vertex];
        for(int i = 0; i < list.size(); i++) {
            int neighbour = (int) list.get(i);
            if(visited.contains(neighbour) || visit(neighbour)) {
                return true;
            }
        }
        visited.remove(vertex);
        return false;
    }
}
