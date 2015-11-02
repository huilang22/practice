/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamTypeFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CtmParamTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamTypeObjectFilter CtmParamTypeFindIn;
/**
 *
 * Constructor to create a  CtmParamTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectFilter CtmParamTypeFindInIn) {
    super(id, context, "CtmParamTypeFind");
    CtmParamTypeFindIn = CtmParamTypeFindInIn;
  }

  public void translateToMap() {
    if (CtmParamTypeFindIn != null) {
      Integer index =  CtmParamTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeFindIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }


/**
 *
 * Sets the CtmParamType
 * @param CtmParamTypeFindInIn Value of the CtmParamTypeFindIn
 *
 */

  public void setCtmParamType(CtmParamTypeObjectFilter CtmParamTypeFindInIn) {
    CtmParamTypeFindIn = CtmParamTypeFindInIn;
  }

  public void translateFromMap() {
    CtmParamTypeFindIn = CtmParamTypeObjectHelper.fromMapFilter(inputMap, "CtmParamType");
  }

/**
 *
 * Gets the CtmParamType
 * @return Value of the CtmParamType
 *
 */

  public CtmParamTypeObjectFilter getCtmParamType( ) {
    return CtmParamTypeFindIn;
  }

}
