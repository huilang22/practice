
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AxrtPaymentTransInterface extends BaliInterface {

  /**
   * Create a AxrtPaymentTrans based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtPaymentTransCreateIn Input  Object.  Derived Fields: ChgDate, TransDate.
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentTransObjectData create (AxrtPaymentTransObjectData AxrtPaymentTransCreateIn) throws BSDMResourceException;
  /**
   * Create a AxrtPaymentTrans based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtPaymentTransCreateIn Input  Object.  Derived Fields: ChgDate, TransDate.
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentTransObjectData create (BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPaymentTransCreateIn) throws BSDMResourceException;


  /**
   * Create a AxrtPaymentTrans based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtPaymentTransCreateIn Input  Object.  Derived Fields: ChgDate, TransDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentTransObjectData create (AxrtPaymentTransObjectData AxrtPaymentTransCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a AxrtPaymentTrans based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtPaymentTransCreateIn Input  Object.  Derived Fields: ChgDate, TransDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentTransObjectData create (BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPaymentTransCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a real-time Payment Transaction.
   * Convenience method using default BSDMSessionContext.
   * @param AxrtPayTransUpdateIn Input  Object.  Read-Only fields: TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentTransObjectData update (AxrtPaymentTransObjectData AxrtPayTransUpdateIn) throws BSDMResourceException;
  /**
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtPayTransUpdateIn Input  Object.  Read-Only fields: TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentTransObjectData update (BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPayTransUpdateIn) throws BSDMResourceException;


  /**
   * Update a real-time Payment Transaction.
   * Convenience method using default BSDMSessionContext.
   * @param AxrtPayTransUpdateIn Input  Object.  Read-Only fields: TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentTransObjectData update (AxrtPaymentTransObjectData AxrtPayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtPayTransUpdateIn Input  Object.  Read-Only fields: TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentTransObjectData update (BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
