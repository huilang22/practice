/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeObjectFilter InvsContainerTypeFindIn;
/**
 *
 * Constructor to create a  InvsContainerTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectFilter InvsContainerTypeFindInIn) {
    super(id, context, "InvsContainerTypeFind");
    InvsContainerTypeFindIn = InvsContainerTypeFindInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeFindIn != null) {
      Integer index =  InvsContainerTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeFindIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }


/**
 *
 * Sets the InvsContainerType
 * @param InvsContainerTypeFindInIn Value of the InvsContainerTypeFindIn
 *
 */

  public void setInvsContainerType(InvsContainerTypeObjectFilter InvsContainerTypeFindInIn) {
    InvsContainerTypeFindIn = InvsContainerTypeFindInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeFindIn = InvsContainerTypeObjectHelper.fromMapFilter(inputMap, "InvsContainerType");
  }

/**
 *
 * Gets the InvsContainerType
 * @return Value of the InvsContainerType
 *
 */

  public InvsContainerTypeObjectFilter getInvsContainerType( ) {
    return InvsContainerTypeFindIn;
  }

}
