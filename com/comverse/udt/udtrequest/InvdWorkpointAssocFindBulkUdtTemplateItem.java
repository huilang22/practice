/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvdWorkpointAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdWorkpointAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdWorkpointAssocObjectFilter InvdWorkpointAssocFindIn;
/**
 *
 * Constructor to create a  InvdWorkpointAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdWorkpointAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectFilter InvdWorkpointAssocFindInIn) {
    super(id, context, "InvdWorkpointAssocFind");
    InvdWorkpointAssocFindIn = InvdWorkpointAssocFindInIn;
  }

  public void translateToMap() {
    if (InvdWorkpointAssocFindIn != null) {
      Integer index =  InvdWorkpointAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocFindIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }


/**
 *
 * Sets the InvdWorkpointAssoc
 * @param InvdWorkpointAssocFindInIn Value of the InvdWorkpointAssocFindIn
 *
 */

  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectFilter InvdWorkpointAssocFindInIn) {
    InvdWorkpointAssocFindIn = InvdWorkpointAssocFindInIn;
  }

  public void translateFromMap() {
    InvdWorkpointAssocFindIn = InvdWorkpointAssocObjectHelper.fromMapFilter(inputMap, "InvdWorkpointAssoc");
  }

/**
 *
 * Gets the InvdWorkpointAssoc
 * @return Value of the InvdWorkpointAssoc
 *
 */

  public InvdWorkpointAssocObjectFilter getInvdWorkpointAssoc( ) {
    return InvdWorkpointAssocFindIn;
  }

}
