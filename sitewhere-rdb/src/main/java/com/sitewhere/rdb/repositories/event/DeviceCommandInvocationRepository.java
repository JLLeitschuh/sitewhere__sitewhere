package com.sitewhere.rdb.repositories.event;

import com.sitewhere.rdb.entities.event.DeviceCommandInvocation;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface DeviceCommandInvocationRepository extends CrudRepository<DeviceCommandInvocation, UUID>, JpaSpecificationExecutor<DeviceCommandInvocation> {
}
