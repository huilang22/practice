/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressStreetDirectionalGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressStreetDirectionalGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressStreetDirectionalObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressStreetDirectionalGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressStreetDirectionalGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectData noOpInIn) {
    super(id, context, "AddressStreetDirectionalGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(noOpIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
/**
 *
 * Sets the  AddressStreetDirectional
 * @param noOpInIn AddressStreetDirectionalObjectData to set
 *
 */
  public void setAddressStreetDirectional(AddressStreetDirectionalObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressStreetDirectional passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetDirectionalObjectData getAddressStreetDirectional() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressStreetDirectionalObjectHelper.fromMap(inputMap, "AddressStreetDirectional");
  }
}
