package org.example.Services;

import java.util.*;

public class PlanRepository implements IPlanRepository {
    Map<Integer, String> plans = new HashMap<>();
    private int id;

    @Override
    public void Create(String plan) {
        id++;
        if (!plans.containsKey(id)) {
            plans.put(id, plan);
            System.out.println("created succesfully");
        }
    }

    @Override
    public String Get(int planId) {
        var plan = plans.get(planId);
        if (plan != null) {
            System.out.println("Plan found: " + plan);
            return plan;
        }
        return "not found";
    }

    @Override
    public List<String> GetAll() {
        var list = new ArrayList<String>();
        for (var plan : plans.values()) {
            list.add(plan);
        }
        return list;
    }

    @Override
    public void Update(Integer id, String plan) {
        if (plans.get(id) != null) {
            plans.put(id, plan);
            System.out.println("plan updated succesfully");
        }
    }

    @Override
    public void Delete(Integer id) {
        if (plans.get(id) != null) {
            plans.remove(id);
            System.out.println("plan deleted succesfully");
        }
    }
}
