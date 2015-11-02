/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsContainerTypeRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeRefObjectFilter InvsContainerTypeRefFindIn;
/**
 *
 * Constructor to create a  InvsContainerTypeRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectFilter InvsContainerTypeRefFindInIn) {
    super(id, context, "InvsContainerTypeRefFind");
    InvsContainerTypeRefFindIn = InvsContainerTypeRefFindInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeRefFindIn != null) {
      Integer index =  InvsContainerTypeRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefFindIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }


/**
 *
 * Sets the InvsContainerTypeRef
 * @param InvsContainerTypeRefFindInIn Value of the InvsContainerTypeRefFindIn
 *
 */

  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectFilter InvsContainerTypeRefFindInIn) {
    InvsContainerTypeRefFindIn = InvsContainerTypeRefFindInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeRefFindIn = InvsContainerTypeRefObjectHelper.fromMapFilter(inputMap, "InvsContainerTypeRef");
  }

/**
 *
 * Gets the InvsContainerTypeRef
 * @return Value of the InvsContainerTypeRef
 *
 */

  public InvsContainerTypeRefObjectFilter getInvsContainerTypeRef( ) {
    return InvsContainerTypeRefFindIn;
  }

}
