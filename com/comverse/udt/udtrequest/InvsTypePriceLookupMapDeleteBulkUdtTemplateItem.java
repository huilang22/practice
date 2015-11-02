/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypePriceLookupMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypePriceLookupMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypePriceLookupMapObjectKeyData ITPLMDeleteIn;
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypePriceLookupMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectKeyData ITPLMDeleteInIn) {
    super(id, context, "InvsTypePriceLookupMapDelete");
    ITPLMDeleteIn = ITPLMDeleteInIn;
  }

  public void translateToMap() {
    if (ITPLMDeleteIn != null) {
      ITPLMDeleteIn.resetFlags(true, true);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(ITPLMDeleteIn, new HashMap(), "InvsTypePriceLookupMapObjectKeyData").get("InvsTypePriceLookupMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsTypePriceLookupMap
 * @param ITPLMDeleteInIn Value of the ITPLMDeleteIn
 *
 */

  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectKeyData ITPLMDeleteInIn) {
    ITPLMDeleteIn = ITPLMDeleteInIn;
  }

  public void translateFromMap() {
    ITPLMDeleteIn = InvsTypePriceLookupMapObjectKeyHelper.fromMap(inputMap, "InvsTypePriceLookupMap");
  }

/**
 *
 * Gets the InvsTypePriceLookupMap
 * @return Value of the InvsTypePriceLookupMap
 *
 */

  public InvsTypePriceLookupMapObjectKeyData getInvsTypePriceLookupMap( ) {
    return ITPLMDeleteIn;
  }

}
