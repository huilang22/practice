/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateUnAssignValidateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a InvElementValidateUnAssignValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementValidateUnAssignValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementValidateObjectData InvElementValidateUnAssignValidateIn;
/**
 *
 * Constructor to create a  InvElementValidateUnAssignValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementValidateUnAssignValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementValidateObjectData InvElementValidateUnAssignValidateInIn) {
    super(id, context, "InvElementValidateUnAssignValidate");
    InvElementValidateUnAssignValidateIn = InvElementValidateUnAssignValidateInIn;
  }

  public void translateToMap() {
    if (InvElementValidateUnAssignValidateIn != null) {
      InvElementValidateUnAssignValidateIn.resetFlags(true, true);
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(InvElementValidateUnAssignValidateIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }


/**
 *
 * Sets the InvElementValidate
 * @param InvElementValidateUnAssignValidateInIn Value of the InvElementValidateUnAssignValidateIn
 *
 */

  public void setInvElementValidate(InvElementValidateObjectData InvElementValidateUnAssignValidateInIn) {
    InvElementValidateUnAssignValidateIn = InvElementValidateUnAssignValidateInIn;
  }

  public void translateFromMap() {
    InvElementValidateUnAssignValidateIn = InvElementValidateObjectHelper.fromMap(inputMap, "InvElementValidate");
  }

/**
 *
 * Gets the InvElementValidate
 * @return Value of the InvElementValidate
 *
 */

  public InvElementValidateObjectData getInvElementValidate( ) {
    return InvElementValidateUnAssignValidateIn;
  }

}
