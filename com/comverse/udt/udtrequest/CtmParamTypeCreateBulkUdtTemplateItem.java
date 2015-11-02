/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtmParamTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamTypeObjectData CtmParamTypeCreateIn;
/**
 *
 * Constructor to create a  CtmParamTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectData CtmParamTypeCreateInIn) {
    super(id, context, "CtmParamTypeCreate");
    CtmParamTypeCreateIn = CtmParamTypeCreateInIn;
  }

  public void translateToMap() {
    if (CtmParamTypeCreateIn != null) {
      CtmParamTypeCreateIn.resetFlags(true, true);
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeCreateIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }


/**
 *
 * Sets the CtmParamType
 * @param CtmParamTypeCreateInIn Value of the CtmParamTypeCreateIn
 *
 */

  public void setCtmParamType(CtmParamTypeObjectData CtmParamTypeCreateInIn) {
    CtmParamTypeCreateIn = CtmParamTypeCreateInIn;
  }

  public void translateFromMap() {
    CtmParamTypeCreateIn = CtmParamTypeObjectHelper.fromMap(inputMap, "CtmParamType");
  }

/**
 *
 * Gets the CtmParamType
 * @return Value of the CtmParamType
 *
 */

  public CtmParamTypeObjectData getCtmParamType( ) {
    return CtmParamTypeCreateIn;
  }

}
