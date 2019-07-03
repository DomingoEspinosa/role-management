import java.util.List;

public class User {
    private List<Role> roleList;

    public User(List<Role> roleList) {
        this.roleList = roleList;
    }

    public void appointAs(Role role){
        roleList.add(role);
    }

    public void withdrawFrom(Role role){
        this.roleList.remove(role);
    }

    public boolean hasAPermission(Permission permission){//TODO MAKE with Streams JAVA 8
        return roleList.stream().anyMatch(s->s.hasPermissionAssigned(permission));
    }


}
