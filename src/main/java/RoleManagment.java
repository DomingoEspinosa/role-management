import java.util.*;

public class RoleManagment {
    public static void main(String[] args) {
        Permission permission = new Permission("777");
        Permission permission2 = new Permission("776");
        Set<Permission> permissions = new HashSet<>();
        permissions.add(permission);
        permissions.add(permission2);

        Role roleAdmin = new Role("Admin", permissions);
        List<Role> roles = new ArrayList<Role>();
        roles.add(roleAdmin);

        User user = new User(roles);

        Set<Permission> permission555 = new HashSet<>();
        permission555.add( new Permission("555"));
        Role roleSuperUser = new Role("SuperUser", permission555);
        user.appointAs(roleSuperUser);
        user.withdrawFrom(roleSuperUser);
        boolean hasAPermission = user.hasAPermission(permission);
        System.out.println(hasAPermission);
    }
}
