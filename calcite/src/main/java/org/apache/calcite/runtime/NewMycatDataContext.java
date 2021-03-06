package org.apache.calcite.runtime;

import org.apache.calcite.DataContext;
import org.apache.calcite.linq4j.Enumerable;

import java.util.List;

public interface NewMycatDataContext extends DataContext {

    public void allocateResource();

    Enumerable<Object[]> getEnumerable(org.apache.calcite.rel.RelNode node);

    List<Enumerable<Object[]>> getEnumerables(org.apache.calcite.rel.RelNode node);

    public Object getSessionVariable(String name);

    public Object getGlobalVariable(String name);

    public String getDatabase();

    public Long getLastInsertId();

    public Long getConnectionId();

    public Object getUserVariable(String name);

    public String getCurrentUser();

    public String getUser();

    public List<Object> getParams();

    public boolean isForUpdate();
}
