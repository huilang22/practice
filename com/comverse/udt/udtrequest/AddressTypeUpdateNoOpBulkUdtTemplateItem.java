/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a AddressTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectData noOpInIn) {
    super(id, context, "AddressTypeUpdate");
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
