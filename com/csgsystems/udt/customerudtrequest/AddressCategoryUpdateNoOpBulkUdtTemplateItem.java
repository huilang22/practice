/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressCategoryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressCategoryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressCategoryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressCategoryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectData noOpInIn) {
    super(id, context, "AddressCategoryUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(noOpIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
/**
 *
 * Sets the  AddressCategory
 * @param noOpInIn AddressCategoryObjectData to set
 *
 */
  public void setAddressCategory(AddressCategoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressCategory passed into the constructor
 * @return Simulated response
 *
 */
  public AddressCategoryObjectData getAddressCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressCategoryObjectHelper.fromMap(inputMap, "AddressCategory");
  }
}
