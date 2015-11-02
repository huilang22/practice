/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesGetBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeTypesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeTypesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LFTObjectKeyData LFTGetIn;
/**
 *
 * Constructor to create a  LateFeeTypesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeTypesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LFTObjectKeyData LFTGetInIn) {
    super(id, context, "LateFeeTypesGet");
    LFTGetIn = LFTGetInIn;
  }

  public void translateToMap() {
    if (LFTGetIn != null) {
      LFTGetIn.resetFlags(true, true);
      addInput("LateFeeTypes", LFTObjectKeyHelper.toMap(LFTGetIn, new HashMap(), "LFTObjectKeyData").get("LFTObjectKeyData"));
    }
  }


/**
 *
 * Sets the LateFeeTypes
 * @param LFTGetInIn Value of the LFTGetIn
 *
 */

  public void setLateFeeTypes(LFTObjectKeyData LFTGetInIn) {
    LFTGetIn = LFTGetInIn;
  }

  public void translateFromMap() {
    LFTGetIn = LFTObjectKeyHelper.fromMap(inputMap, "LateFeeTypes");
  }

/**
 *
 * Gets the LateFeeTypes
 * @return Value of the LateFeeTypes
 *
 */

  public LFTObjectKeyData getLateFeeTypes( ) {
    return LFTGetIn;
  }

}
