package org.example.Services;

import java.util.List;

public interface IPlanRepository {
    void Create(String plan);

    String Get(int planId);

    List<String> GetAll();

    void Update(Integer id, String plan);

    void Delete(Integer id);
}
