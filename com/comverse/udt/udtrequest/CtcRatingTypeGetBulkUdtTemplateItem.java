/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeGetBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcRatingTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcRatingTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectKeyData GetInIn) {
    super(id, context, "CtcRatingTypeGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingTypeObjectKeyData").get("CtcRatingTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcRatingTypeObjectKeyHelper.fromMap(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectKeyData getCtcRatingType( ) {
    return GetIn;
  }

}
