/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementBulkCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementBulkCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementBulkCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData[] InvElementBulkCreateIn;
/**
 *
 * Constructor to create a  InvElementBulkCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementBulkCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData[] InvElementBulkCreateInIn) {
    super(id, context, "InvElementBulkCreate");
    InvElementBulkCreateIn = InvElementBulkCreateInIn;
  }

  public void translateToMap() {
    if (InvElementBulkCreateIn != null) {
      if (InvElementBulkCreateIn != null) {
        Object[] list = new Object[InvElementBulkCreateIn.length];
        for (int i = 0; i < InvElementBulkCreateIn.length; i++) {
          list[i] = InvElementObjHelper.getMap(InvElementBulkCreateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
        }
        addInput("InvElementList", list);
      }
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvElementBulkCreateInIn Value of the InvElementBulkCreateIn
 *
 */

  public void setInvElement(InvElementObjData[] InvElementBulkCreateInIn) {
    InvElementBulkCreateIn = InvElementBulkCreateInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("InvElementList");
    if (list != null) {
      InvElementBulkCreateIn = new InvElementObjData[list.length];
      for (int i = 0; i < list.length; i++) {
        InvElementBulkCreateIn[i] = InvElementObjHelper.getObj((Map) list[i]);
        InvElementBulkCreateIn[i].resetFlags(true, true);
      }
    }
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData[] getInvElement( ) {
    return InvElementBulkCreateIn;
  }

}
