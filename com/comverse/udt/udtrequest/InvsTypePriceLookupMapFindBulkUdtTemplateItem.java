/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypePriceLookupMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypePriceLookupMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypePriceLookupMapObjectFilter ITPLMFindIn;
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypePriceLookupMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectFilter ITPLMFindInIn) {
    super(id, context, "InvsTypePriceLookupMapFind");
    ITPLMFindIn = ITPLMFindInIn;
  }

  public void translateToMap() {
    if (ITPLMFindIn != null) {
      Integer index =  ITPLMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMFindIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }


/**
 *
 * Sets the InvsTypePriceLookupMap
 * @param ITPLMFindInIn Value of the ITPLMFindIn
 *
 */

  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectFilter ITPLMFindInIn) {
    ITPLMFindIn = ITPLMFindInIn;
  }

  public void translateFromMap() {
    ITPLMFindIn = InvsTypePriceLookupMapObjectHelper.fromMapFilter(inputMap, "InvsTypePriceLookupMap");
  }

/**
 *
 * Gets the InvsTypePriceLookupMap
 * @return Value of the InvsTypePriceLookupMap
 *
 */

  public InvsTypePriceLookupMapObjectFilter getInvsTypePriceLookupMap( ) {
    return ITPLMFindIn;
  }

}
