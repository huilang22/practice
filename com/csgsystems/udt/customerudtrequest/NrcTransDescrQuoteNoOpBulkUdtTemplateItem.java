/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrQuoteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcTransDescrQuoteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTransDescrQuoteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTransDescrQuoteOutputData noOpIn;

/**
 *
 * Constructor to create a   NrcTransDescrQuoteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTransDescrQuoteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrQuoteOutputData noOpInIn) {
    super(id, context, "NrcTransDescrQuote");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTransDescrQuoteOutputData", NrcTransDescrQuoteOutputHelper.toMap(noOpIn).get("NrcTransDescrQuoteOutputData"));
    }
  }
/**
 *
 * Sets the  NrcTransDescrQuoteOutputData
 * @param noOpInIn NrcTransDescrQuoteOutputData to set
 *
 */
  public void setNrcTransDescrQuoteOutputData(NrcTransDescrQuoteOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTransDescrQuoteOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrQuoteOutputData getNrcTransDescrQuoteOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTransDescrQuoteOutputHelper.fromMap(inputMap);
  }
}
