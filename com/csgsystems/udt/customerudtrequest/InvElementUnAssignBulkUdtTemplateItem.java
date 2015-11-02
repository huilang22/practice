/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementUnAssignBulkUdtTemplateItem.java
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
 * Class used to create a InvElementUnAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementUnAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvUnAsgnIn;
  protected Integer DisconnectReason;
/**
 *
 * Constructor to create a  InvElementUnAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementUnAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvUnAsgnInIn, Integer DisconnectReasonIn) {
    super(id, context, "InvElementUnAssign");
    InvUnAsgnIn = InvUnAsgnInIn;
    DisconnectReason = DisconnectReasonIn;
  }

  public void translateToMap() {
    if (InvUnAsgnIn != null) {
      InvUnAsgnIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvUnAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (DisconnectReason != null) {
      addInput("DisconnectReason", DisconnectReason);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvUnAsgnInIn Value of the InvUnAsgnIn
 *
 */

  public void setInvElement(InvElementObjData InvUnAsgnInIn) {
    InvUnAsgnIn = InvUnAsgnInIn;
  }

/**
 *
 * Sets the DisconnectReason
 * @param DisconnectReasonIn Value of the DisconnectReason
 *
 */

  public void setDisconnectReason(Integer DisconnectReasonIn) {
    DisconnectReason = DisconnectReasonIn;
  }

  public void translateFromMap() {
    InvUnAsgnIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    DisconnectReason = (Integer)inputMap.get("DisconnectReason");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvUnAsgnIn;
  }

/**
 *
 * Gets the DisconnectReason
 * @return Value of the DisconnectReason
 *
 */

  public Integer getDisconnectReason( ) {
    return DisconnectReason;
  }

}
