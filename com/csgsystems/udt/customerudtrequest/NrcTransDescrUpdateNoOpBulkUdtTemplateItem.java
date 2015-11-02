/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcTransDescrUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTransDescrUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTransDescrObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcTransDescrUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTransDescrUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData noOpInIn) {
    super(id, context, "NrcTransDescrUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(noOpIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
/**
 *
 * Sets the  NrcTransDescr
 * @param noOpInIn NrcTransDescrObjectData to set
 *
 */
  public void setNrcTransDescr(NrcTransDescrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTransDescr passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectData getNrcTransDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescr");
  }
}
