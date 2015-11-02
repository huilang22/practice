/*
 * Generated code DO NOT EDIT
 * Generated file: EpiAssignDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EpiAssignDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiAssignDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiAssignObjectKeyData EASSDeleteIn;
/**
 *
 * Constructor to create a  EpiAssignDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiAssignDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectKeyData EASSDeleteInIn) {
    super(id, context, "EpiAssignDelete");
    EASSDeleteIn = EASSDeleteInIn;
  }

  public void translateToMap() {
    if (EASSDeleteIn != null) {
      EASSDeleteIn.resetFlags(true, true);
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(EASSDeleteIn, new HashMap(), "EpiAssignObjectKeyData").get("EpiAssignObjectKeyData"));
    }
  }


/**
 *
 * Sets the EpiAssign
 * @param EASSDeleteInIn Value of the EASSDeleteIn
 *
 */

  public void setEpiAssign(EpiAssignObjectKeyData EASSDeleteInIn) {
    EASSDeleteIn = EASSDeleteInIn;
  }

  public void translateFromMap() {
    EASSDeleteIn = EpiAssignObjectKeyHelper.fromMap(inputMap, "EpiAssign");
  }

/**
 *
 * Gets the EpiAssign
 * @return Value of the EpiAssign
 *
 */

  public EpiAssignObjectKeyData getEpiAssign( ) {
    return EASSDeleteIn;
  }

}
