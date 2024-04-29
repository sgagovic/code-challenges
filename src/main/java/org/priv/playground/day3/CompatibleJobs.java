package org.priv.playground.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
You are given a list of jobs to be done, where each job is represented by a start time and end time. Two jobs are compatible if they don't overlap. Find the largest subset of compatible jobs.

For example, given the following jobs (there is no guarantee that jobs will be sorted):

[(0, 6),
(1, 4),
(3, 5),
(3, 8),
(4, 7),
(5, 9),
(6, 10),
(8, 11)]
Return:

[(1, 4),
(4, 7),
(8, 11)]
 */
public class CompatibleJobs {

    //first job starts at 0 and that means that is not compatible with neither one of the jobs since neither one can start duringit
    //take second job from 1-4, next job that can start is from 4-7 and and the first one that can start after is from 8-11

    public List<Pair> findCompatibleJobs(List<Pair> jobs){

        List<Pair> compatibleJobs = new ArrayList<>();
        List<Pair> compatibleJobsTemp = new ArrayList<>();
        int currentSubsetLength = 0;
        int newSubsetLength = 0;

        //First sort all jobs so they come chronically
        Collections.sort(jobs, Comparator.comparingInt((Pair a) -> a.start).thenComparingInt(a -> a.end));

        for(int i=0; i<jobs.size(); i++){
            int end = jobs.get(i).end;
            compatibleJobsTemp.add(jobs.get(i));

            //give next that starts after 6 or at 6, you can maybe filter them out

            for(int j=i+1; j<jobs.size(); j++){
                int nextStart = jobs.get(j).start;

                if(end <= nextStart){
                    compatibleJobsTemp.add(jobs.get(j));
                    currentSubsetLength = compatibleJobsTemp.size();
                    end = jobs.get(j).end;
                }
            }

            if(newSubsetLength <= currentSubsetLength){
                compatibleJobs = compatibleJobsTemp;
                newSubsetLength = compatibleJobs.size();
            }

            currentSubsetLength = 0;
            compatibleJobsTemp = new ArrayList<>();
        }

        return compatibleJobs;
    }

    public List<Pair> findLargestSubsetGreedy(List<Pair> jobs){
        List<Pair> result = new ArrayList<>();

        if (jobs == null || jobs.isEmpty()) {
            return result;
        }

        Collections.sort(jobs, Comparator.comparingInt((Pair a) -> a.start).thenComparingInt(a -> a.end));

        Pair prevJob = jobs.get(0);
        result.add(prevJob);

        for (int i = 1; i < jobs.size(); i++) {
            Pair currentJob = jobs.get(i);
            // If the current job doesn't overlap with the previous job, add it to the result
            if (currentJob.start >= prevJob.end) {
                result.add(currentJob);
                prevJob = currentJob;
            }
        }

        return result;

    }
}
