/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressServiceServiceabilityValidateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceAddressServiceServiceabilityValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressServiceServiceabilityValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcAddrObjectData[] ServiceValidateIn;
  protected BigInteger ServiceAddress_id;
/**
 *
 * Constructor to create a  ServiceAddressServiceServiceabilityValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressServiceServiceabilityValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcAddrObjectData[] ServiceValidateInIn, BigInteger ServiceAddress_idIn) {
    super(id, context, "ServiceAddressServiceServiceabilityValidate");
    ServiceValidateIn = ServiceValidateInIn;
    ServiceAddress_id = ServiceAddress_idIn;
  }

  public void translateToMap() {
    if (ServiceValidateIn != null) {
      if (ServiceValidateIn != null) {
        Object[] list = new Object[ServiceValidateIn.length];
        for (int i = 0; i < ServiceValidateIn.length; i++) {
          list[i] = SvcAddrObjectHelper.getMap(ServiceValidateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
        }
        addInput("ServiceList", list);
      }
    }
    if (ServiceAddress_id != null) {
      addInput("AddressId", ServiceAddress_id);
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceValidateInIn Value of the ServiceValidateIn
 *
 */

  public void setService(SvcAddrObjectData[] ServiceValidateInIn) {
    ServiceValidateIn = ServiceValidateInIn;
  }

/**
 *
 * Sets the AddressId
 * @param ServiceAddress_idIn Value of the ServiceAddress_id
 *
 */

  public void setAddressId(BigInteger ServiceAddress_idIn) {
    ServiceAddress_id = ServiceAddress_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      ServiceValidateIn = new SvcAddrObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ServiceValidateIn[i] = SvcAddrObjectHelper.getObj((Map) list[i]);
        ServiceValidateIn[i].resetFlags(true, true);
      }
    }
    ServiceAddress_id = (BigInteger)inputMap.get("AddressId");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public SvcAddrObjectData[] getService( ) {
    return ServiceValidateIn;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return ServiceAddress_id;
  }

}
