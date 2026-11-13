package in.saha.SecurityAuthentication.service;

import in.saha.SecurityAuthentication.entity.Role;
import in.saha.SecurityAuthentication.repository.RoleRepository;
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
