package in.saha.JWTAuthentication.service;
import in.saha.JWTAuthentication.entity.Role;
import in.saha.JWTAuthentication.repository.RoleRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
