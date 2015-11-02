/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressStreetSuffixGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressStreetSuffixGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressStreetSuffixObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressStreetSuffixGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressStreetSuffixGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectData noOpInIn) {
    super(id, context, "AddressStreetSuffixGet");
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
