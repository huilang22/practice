/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypePriceLookupMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypePriceLookupMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypePriceLookupMapObjectData ITPLMUpdateIn;
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypePriceLookupMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectData ITPLMUpdateInIn) {
    super(id, context, "InvsTypePriceLookupMapUpdate");
    ITPLMUpdateIn = ITPLMUpdateInIn;
  }

  public void translateToMap() {
    if (ITPLMUpdateIn != null) {
      ITPLMUpdateIn.resetFlags(true, true);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMUpdateIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }


/**
 *
 * Sets the InvsTypePriceLookupMap
 * @param ITPLMUpdateInIn Value of the ITPLMUpdateIn
 *
 */

  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectData ITPLMUpdateInIn) {
    ITPLMUpdateIn = ITPLMUpdateInIn;
  }

  public void translateFromMap() {
    ITPLMUpdateIn = InvsTypePriceLookupMapObjectHelper.fromMap(inputMap, "InvsTypePriceLookupMap");
  }

/**
 *
 * Gets the InvsTypePriceLookupMap
 * @return Value of the InvsTypePriceLookupMap
 *
 */

  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMap( ) {
    return ITPLMUpdateIn;
  }

}
