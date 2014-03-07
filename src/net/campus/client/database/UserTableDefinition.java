package net.campus.client.database;

import org.droidpersistence.dao.TableDefinition;

public class UserTableDefinition extends TableDefinition<User>{

    public UserTableDefinition() {
            super(User.class);              
    }
}
