package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

public interface CheckItemDao {
    public void add(CheckItem checkItem);
    public Page<CheckItem> pageQuery(String queryString);
    public void deleteById(Integer id);
    public long findCountByCheckItemId(Integer checkItemId);
    public CheckItem findById(Integer id);
    public void edit(CheckItem checkItem);
}
