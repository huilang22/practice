/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtmParamCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamBaseObjectData CtmParamCreateIn;
/**
 *
 * Constructor to create a  CtmParamCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamBaseObjectData CtmParamCreateInIn) {
    super(id, context, "CtmParamCreate");
    CtmParamCreateIn = CtmParamCreateInIn;
  }

  public void translateToMap() {
    if (CtmParamCreateIn != null) {
      CtmParamCreateIn.resetFlags(true, true);
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(CtmParamCreateIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }


/**
 *
 * Sets the CtmParam
 * @param CtmParamCreateInIn Value of the CtmParamCreateIn
 *
 */

  public void setCtmParam(CtmParamBaseObjectData CtmParamCreateInIn) {
    CtmParamCreateIn = CtmParamCreateInIn;
  }

  public void translateFromMap() {
    CtmParamCreateIn = CtmParamBaseObjectHelper.fromMap(inputMap, "CtmParam");
  }

/**
 *
 * Gets the CtmParam
 * @return Value of the CtmParam
 *
 */

  public CtmParamBaseObjectData getCtmParam( ) {
    return CtmParamCreateIn;
  }

}
