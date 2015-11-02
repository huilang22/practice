/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressSecondaryUnitTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressSecondaryUnitTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressSecondaryUnitTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressSecondaryUnitTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressSecondaryUnitTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectData noOpInIn) {
    super(id, context, "AddressSecondaryUnitTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(noOpIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
/**
 *
 * Sets the  AddressSecondaryUnitType
 * @param noOpInIn AddressSecondaryUnitTypeObjectData to set
 *
 */
  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressSecondaryUnitType passed into the constructor
 * @return Simulated response
 *
 */
  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressSecondaryUnitTypeObjectHelper.fromMap(inputMap, "AddressSecondaryUnitType");
  }
}
