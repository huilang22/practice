/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdrAddressObjectFilter AAFindWithIn;
/**
 *
 * Constructor to create a  AdrAddressFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectFilter AAFindWithInIn) {
    super(id, context, "AdrAddressFindWithExtendedData");
    AAFindWithIn = AAFindWithInIn;
  }

  public void translateToMap() {
    if (AAFindWithIn != null) {
      Integer index =  AAFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(AAFindWithIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param AAFindWithInIn Value of the AAFindWithIn
 *
 */

  public void setAdrAddress(AdrAddressObjectFilter AAFindWithInIn) {
    AAFindWithIn = AAFindWithInIn;
  }

  public void translateFromMap() {
    AAFindWithIn = AdrAddressObjectHelper.fromMapFilter(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public AdrAddressObjectFilter getAdrAddress( ) {
    return AAFindWithIn;
  }

}
