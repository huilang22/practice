/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableInventoryTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a ServiceableInventoryTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceableInventoryTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger AddressIdIn;
/**
 *
 * Constructor to create a  ServiceableInventoryTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceableInventoryTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger AddressIdInIn) {
    super(id, context, "ServiceableInventoryTypeFind");
    AddressIdIn = AddressIdInIn;
  }

  public void translateToMap() {
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }


/**
 *
 * Sets the AddressIdIn
 * @param AddressIdInIn Value of the AddressIdIn
 *
 */

  public void setAddressIdIn(BigInteger AddressIdInIn) {
    AddressIdIn = AddressIdInIn;
  }

  public void translateFromMap() {
    AddressIdIn = (BigInteger)inputMap.get("AddressIdIn");
  }

/**
 *
 * Gets the AddressIdIn
 * @return Value of the AddressIdIn
 *
 */

  public BigInteger getAddressIdIn( ) {
    return AddressIdIn;
  }

}
