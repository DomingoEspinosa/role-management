import java.util.List;
import java.util.Set;

public class Role {
    private String description;
    private Set<Permission> permissionList;

    public Role(String description, Set<Permission> permissionList) {
        this.description = description;
        this.permissionList = permissionList;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public boolean hasPermissionAssigned(Permission permission) {
        return permissionList.contains(permission);
    }
    
    public void addPermission(Permission permission){
        this.permissionList.add(permission);
    }

    public void addListPermission(List<Permission> permissionList){
        this.permissionList.addAll(permissionList);
    }

    public void withdrawPermission(Permission permission){
        this.permissionList.remove(permission);
    }

    public void withdrawAListOfPermision(Set<Permission> permissionList){
        this.permissionList.removeAll(permissionList);
    }
    
    
}
