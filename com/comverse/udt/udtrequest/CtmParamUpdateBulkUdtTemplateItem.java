/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtmParamUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamBaseObjectData CtmParamUpdateIn;
/**
 *
 * Constructor to create a  CtmParamUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamBaseObjectData CtmParamUpdateInIn) {
    super(id, context, "CtmParamUpdate");
    CtmParamUpdateIn = CtmParamUpdateInIn;
  }

  public void translateToMap() {
    if (CtmParamUpdateIn != null) {
      CtmParamUpdateIn.resetFlags(true, true);
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(CtmParamUpdateIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }


/**
 *
 * Sets the CtmParam
 * @param CtmParamUpdateInIn Value of the CtmParamUpdateIn
 *
 */

  public void setCtmParam(CtmParamBaseObjectData CtmParamUpdateInIn) {
    CtmParamUpdateIn = CtmParamUpdateInIn;
  }

  public void translateFromMap() {
    CtmParamUpdateIn = CtmParamBaseObjectHelper.fromMap(inputMap, "CtmParam");
  }

/**
 *
 * Gets the CtmParam
 * @return Value of the CtmParam
 *
 */

  public CtmParamBaseObjectData getCtmParam( ) {
    return CtmParamUpdateIn;
  }

}
