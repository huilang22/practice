/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetSuffixCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressStreetSuffixCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressStreetSuffixCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressStreetSuffixObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressStreetSuffixCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressStreetSuffixCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectData noOpInIn) {
    super(id, context, "AddressStreetSuffixCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(noOpIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
/**
 *
 * Sets the  AddressStreetSuffix
 * @param noOpInIn AddressStreetSuffixObjectData to set
 *
 */
  public void setAddressStreetSuffix(AddressStreetSuffixObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressStreetSuffix passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetSuffixObjectData getAddressStreetSuffix() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressStreetSuffixObjectHelper.fromMap(inputMap, "AddressStreetSuffix");
  }
}
