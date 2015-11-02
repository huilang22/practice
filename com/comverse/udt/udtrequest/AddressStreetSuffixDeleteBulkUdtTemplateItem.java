/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetSuffixDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetSuffixDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetSuffixObjectData ASSDeleteIn;
/**
 *
 * Constructor to create a  AddressStreetSuffixDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetSuffixDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectData ASSDeleteInIn) {
    super(id, context, "AddressStreetSuffixDelete");
    ASSDeleteIn = ASSDeleteInIn;
  }

  public void translateToMap() {
    if (ASSDeleteIn != null) {
      ASSDeleteIn.resetFlags(true, true);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the AddressStreetSuffix
 * @param ASSDeleteInIn Value of the ASSDeleteIn
 *
 */

  public void setAddressStreetSuffix(AddressStreetSuffixObjectData ASSDeleteInIn) {
    ASSDeleteIn = ASSDeleteInIn;
  }

  public void translateFromMap() {
    ASSDeleteIn = AddressStreetSuffixObjectHelper.fromMap(inputMap, "AddressStreetSuffix");
  }

/**
 *
 * Gets the AddressStreetSuffix
 * @return Value of the AddressStreetSuffix
 *
 */

  public AddressStreetSuffixObjectData getAddressStreetSuffix( ) {
    return ASSDeleteIn;
  }

}
