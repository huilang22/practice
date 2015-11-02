/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a AdrAddressFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdrAddressObjectFilter AdrAddressFindIn;
/**
 *
 * Constructor to create a  AdrAddressFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectFilter AdrAddressFindInIn) {
    super(id, context, "AdrAddressFind");
    AdrAddressFindIn = AdrAddressFindInIn;
  }

  public void translateToMap() {
    if (AdrAddressFindIn != null) {
      Integer index =  AdrAddressFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(AdrAddressFindIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param AdrAddressFindInIn Value of the AdrAddressFindIn
 *
 */

  public void setAdrAddress(AdrAddressObjectFilter AdrAddressFindInIn) {
    AdrAddressFindIn = AdrAddressFindInIn;
  }

  public void translateFromMap() {
    AdrAddressFindIn = AdrAddressObjectHelper.fromMapFilter(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public AdrAddressObjectFilter getAdrAddress( ) {
    return AdrAddressFindIn;
  }

}
