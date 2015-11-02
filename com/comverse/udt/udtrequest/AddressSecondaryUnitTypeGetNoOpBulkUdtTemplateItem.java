/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressSecondaryUnitTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressSecondaryUnitTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressSecondaryUnitTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   AddressSecondaryUnitTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressSecondaryUnitTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectData noOpInIn) {
    super(id, context, "AddressSecondaryUnitTypeGet");
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
