/*
 * Generated code DO NOT EDIT
 * Generated file: AddressTypeGetNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a AddressTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectData noOpInIn) {
    super(id, context, "AddressTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AddressType", AddressTypeObjectHelper.toMap(noOpIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }
/**
 *
 * Sets the  AddressType
 * @param noOpInIn AddressTypeObjectData to set
 *
 */
  public void setAddressType(AddressTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressType passed into the constructor
 * @return Simulated response
 *
 */
  public AddressTypeObjectData getAddressType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressTypeObjectHelper.fromMap(inputMap, "AddressType");
  }
}
