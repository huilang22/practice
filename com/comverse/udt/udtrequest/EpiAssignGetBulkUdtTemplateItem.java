/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignGetBulkUdtTemplateItem.java
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
 * Class used to create a EpiAssignGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiAssignGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiAssignObjectKeyData EASSGetIn;
/**
 *
 * Constructor to create a  EpiAssignGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiAssignGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectKeyData EASSGetInIn) {
    super(id, context, "EpiAssignGet");
    EASSGetIn = EASSGetInIn;
  }

  public void translateToMap() {
    if (EASSGetIn != null) {
      EASSGetIn.resetFlags(true, true);
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(EASSGetIn, new HashMap(), "EpiAssignObjectKeyData").get("EpiAssignObjectKeyData"));
    }
  }


/**
 *
 * Sets the EpiAssign
 * @param EASSGetInIn Value of the EASSGetIn
 *
 */

  public void setEpiAssign(EpiAssignObjectKeyData EASSGetInIn) {
    EASSGetIn = EASSGetInIn;
  }

  public void translateFromMap() {
    EASSGetIn = EpiAssignObjectKeyHelper.fromMap(inputMap, "EpiAssign");
  }

/**
 *
 * Gets the EpiAssign
 * @return Value of the EpiAssign
 *
 */

  public EpiAssignObjectKeyData getEpiAssign( ) {
    return EASSGetIn;
  }

}
