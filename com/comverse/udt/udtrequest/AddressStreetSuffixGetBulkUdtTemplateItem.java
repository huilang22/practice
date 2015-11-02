/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixGetBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetSuffixGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetSuffixGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetSuffixObjectKeyData ASSGetIn;
/**
 *
 * Constructor to create a  AddressStreetSuffixGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetSuffixGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectKeyData ASSGetInIn) {
    super(id, context, "AddressStreetSuffixGet");
    ASSGetIn = ASSGetInIn;
  }

  public void translateToMap() {
    if (ASSGetIn != null) {
      ASSGetIn.resetFlags(true, true);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectKeyHelper.toMap(ASSGetIn, new HashMap(), "AddressStreetSuffixObjectKeyData").get("AddressStreetSuffixObjectKeyData"));
    }
  }


/**
 *
 * Sets the AddressStreetSuffix
 * @param ASSGetInIn Value of the ASSGetIn
 *
 */

  public void setAddressStreetSuffix(AddressStreetSuffixObjectKeyData ASSGetInIn) {
    ASSGetIn = ASSGetInIn;
  }

  public void translateFromMap() {
    ASSGetIn = AddressStreetSuffixObjectKeyHelper.fromMap(inputMap, "AddressStreetSuffix");
  }

/**
 *
 * Gets the AddressStreetSuffix
 * @return Value of the AddressStreetSuffix
 *
 */

  public AddressStreetSuffixObjectKeyData getAddressStreetSuffix( ) {
    return ASSGetIn;
  }

}
