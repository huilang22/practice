/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetSuffixUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetSuffixUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetSuffixObjectData ASSUpdateIn;
/**
 *
 * Constructor to create a  AddressStreetSuffixUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetSuffixUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectData ASSUpdateInIn) {
    super(id, context, "AddressStreetSuffixUpdate");
    ASSUpdateIn = ASSUpdateInIn;
  }

  public void translateToMap() {
    if (ASSUpdateIn != null) {
      ASSUpdateIn.resetFlags(true, true);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSUpdateIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }


/**
 *
 * Sets the AddressStreetSuffix
 * @param ASSUpdateInIn Value of the ASSUpdateIn
 *
 */

  public void setAddressStreetSuffix(AddressStreetSuffixObjectData ASSUpdateInIn) {
    ASSUpdateIn = ASSUpdateInIn;
  }

  public void translateFromMap() {
    ASSUpdateIn = AddressStreetSuffixObjectHelper.fromMap(inputMap, "AddressStreetSuffix");
  }

/**
 *
 * Gets the AddressStreetSuffix
 * @return Value of the AddressStreetSuffix
 *
 */

  public AddressStreetSuffixObjectData getAddressStreetSuffix( ) {
    return ASSUpdateIn;
  }

}
