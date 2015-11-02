/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamFindBulkUdtTemplateItem.java
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
 * Class used to create a CtmParamFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamObjectFilter CtmParamFindIn;
/**
 *
 * Constructor to create a  CtmParamFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamObjectFilter CtmParamFindInIn) {
    super(id, context, "CtmParamFind");
    CtmParamFindIn = CtmParamFindInIn;
  }

  public void translateToMap() {
    if (CtmParamFindIn != null) {
      Integer index =  CtmParamFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmParam", CtmParamObjectHelper.toMap(CtmParamFindIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }


/**
 *
 * Sets the CtmParam
 * @param CtmParamFindInIn Value of the CtmParamFindIn
 *
 */

  public void setCtmParam(CtmParamObjectFilter CtmParamFindInIn) {
    CtmParamFindIn = CtmParamFindInIn;
  }

  public void translateFromMap() {
    CtmParamFindIn = CtmParamObjectHelper.fromMapFilter(inputMap, "CtmParam");
  }

/**
 *
 * Gets the CtmParam
 * @return Value of the CtmParam
 *
 */

  public CtmParamObjectFilter getCtmParam( ) {
    return CtmParamFindIn;
  }

}
