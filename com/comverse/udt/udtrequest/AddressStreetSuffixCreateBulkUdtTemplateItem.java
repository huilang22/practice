/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixCreateBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetSuffixCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetSuffixCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetSuffixObjectData ASSCreateIn;
/**
 *
 * Constructor to create a  AddressStreetSuffixCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetSuffixCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectData ASSCreateInIn) {
    super(id, context, "AddressStreetSuffixCreate");
    ASSCreateIn = ASSCreateInIn;
  }

  public void translateToMap() {
    if (ASSCreateIn != null) {
      ASSCreateIn.resetFlags(true, true);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSCreateIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }


/**
 *
 * Sets the AddressStreetSuffix
 * @param ASSCreateInIn Value of the ASSCreateIn
 *
 */

  public void setAddressStreetSuffix(AddressStreetSuffixObjectData ASSCreateInIn) {
    ASSCreateIn = ASSCreateInIn;
  }

  public void translateFromMap() {
    ASSCreateIn = AddressStreetSuffixObjectHelper.fromMap(inputMap, "AddressStreetSuffix");
  }

/**
 *
 * Gets the AddressStreetSuffix
 * @return Value of the AddressStreetSuffix
 *
 */

  public AddressStreetSuffixObjectData getAddressStreetSuffix( ) {
    return ASSCreateIn;
  }

}
