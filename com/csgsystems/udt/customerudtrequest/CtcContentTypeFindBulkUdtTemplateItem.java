/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcContentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcContentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcContentTypeObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcContentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcContentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectFilter FindInIn) {
    super(id, context, "CtcContentTypeFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }


/**
 *
 * Sets the CtcContentType
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcContentType(CtcContentTypeObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcContentTypeObjectHelper.fromMapFilter(inputMap, "CtcContentType");
  }

/**
 *
 * Gets the CtcContentType
 * @return Value of the CtcContentType
 *
 */

  public CtcContentTypeObjectFilter getCtcContentType( ) {
    return FindIn;
  }

}
