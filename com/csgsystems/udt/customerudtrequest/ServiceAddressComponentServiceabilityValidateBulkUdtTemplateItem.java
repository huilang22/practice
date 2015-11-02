/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressComponentServiceabilityValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressComponentServiceabilityValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressComponentServiceabilityValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcAddrObjectData[] ComponentValidateIn;
  protected BigInteger ComponentAddress_idIn;
/**
 *
 * Constructor to create a  ServiceAddressComponentServiceabilityValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressComponentServiceabilityValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcAddrObjectData[] ComponentValidateInIn, BigInteger ComponentAddress_idInIn) {
    super(id, context, "ServiceAddressComponentServiceabilityValidate");
    ComponentValidateIn = ComponentValidateInIn;
    ComponentAddress_idIn = ComponentAddress_idInIn;
  }

  public void translateToMap() {
    if (ComponentValidateIn != null) {
      if (ComponentValidateIn != null) {
        Object[] list = new Object[ComponentValidateIn.length];
        for (int i = 0; i < ComponentValidateIn.length; i++) {
          list[i] = SvcAddrObjectHelper.getMap(ComponentValidateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "Component");
        }
        addInput("ServiceList", list);
      }
    }
    if (ComponentAddress_idIn != null) {
      addInput("AddressId", ComponentAddress_idIn);
    }
  }


/**
 *
 * Sets the Service
 * @param ComponentValidateInIn Value of the ComponentValidateIn
 *
 */

  public void setService(SvcAddrObjectData[] ComponentValidateInIn) {
    ComponentValidateIn = ComponentValidateInIn;
  }

/**
 *
 * Sets the AddressId
 * @param ComponentAddress_idInIn Value of the ComponentAddress_idIn
 *
 */

  public void setAddressId(BigInteger ComponentAddress_idInIn) {
    ComponentAddress_idIn = ComponentAddress_idInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      ComponentValidateIn = new SvcAddrObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ComponentValidateIn[i] = SvcAddrObjectHelper.getObj((Map) list[i]);
        ComponentValidateIn[i].resetFlags(true, true);
      }
    }
    ComponentAddress_idIn = (BigInteger)inputMap.get("AddressId");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public SvcAddrObjectData[] getService( ) {
    return ComponentValidateIn;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return ComponentAddress_idIn;
  }

}
