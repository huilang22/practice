/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrValidateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcTransDescrValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTransDescrValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTransDescrObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcTransDescrValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTransDescrValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData noOpInIn) {
    super(id, context, "NrcTransDescrValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(noOpIn, new HashMap(), "NrcTransDescrValidate").get("NrcTransDescrValidate"));
    }
  }
/**
 *
 * Sets the  NrcTransDescrValidate
 * @param noOpInIn NrcTransDescrObjectData to set
 *
 */
  public void setNrcTransDescrValidate(NrcTransDescrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTransDescrValidate passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectData getNrcTransDescrValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescrValidate");
  }
}
