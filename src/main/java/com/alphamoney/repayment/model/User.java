package com.alphamoney.repayment.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "p2p_logindetails")
@Setter
@Getter
@Data // Generates getters, setters, equals, hashCode, and toString
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonProperty("id")
    private Long id;

    @Column(name = "payee_id")
//    @JsonProperty("payeeId")
    private String payeeId;

    @Column(name = "escrow_account_id")
//    @JsonProperty("escrowAccountId")
    private String escrowAccountId;

    @Column(name = "cp_id")
    private Integer cpId;

    @Column(name = "mobile")
//    @JsonProperty("mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "legal_name")
    private String legalName;

    @Column(name = "constitution")
    private String constitution;

    @Column(name = "usertype")
    private String usertype;

    @Column(name = "alpha_score")
    private String alphaScore;

    @Column(name = "alpha_rating")
    private String alphaRating;

    @Column(name = "employment_type")
    private String employmentType;

    @Column(name = "channel_partner_type")
    private String channelPartnerType;

    @Column(name = "bc_type")
    private String bcType;

    @Column(name = "is_aadhaar_verified")
    private Boolean isAadhaarVerified;

    @Column(name = "is_bank_verified")
    private Boolean isBankVerified;

    @Column(name = "is_pan_verified")
    private Boolean isPanVerified;

    @Column(name = "is_gst_verified")
    private Boolean isGstVerified;

    @Column(name = "form_completed_status")
    private Boolean formCompletedStatus;

    @Column(name = "account_approval_status")
    private Boolean accountApprovalStatus;

    @Column(name = "registration_fee_status")
    private Boolean registrationFeeStatus;

    @Column(name = "activated")
    private String activated;

    @Column(name = "photo")
    private String photo;

    @Column(name = "dob")
    private String dob;

    @Column(name = "pan")
    private String pan;

    @Column(name = "gst")
    private String gst;

    @Column(name = "cp_referral_code")
    private String cpReferralCode;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @Column(name = "deleted_at")
    private String deletedAt;

    @Column(name = "emi_pay_from")
    private String emiPayFrom;

    @Column(name = "userStage")
    private Boolean userStage;

    @Column(name = "isMobile")
    private Integer isMobile;

    @Column(name = "isAadhaarManual")
    private Integer isAadhaarManual;

    @Column(name = "ext_agent_refrence_userId")
    private Integer extAgentReferenceUserId;

    @Column(name = "ext_user_refrence_id")
    private Integer extUserReferenceId;

    @Column(name = "agent_refrence")
    private String agentReference;

    @Column(name = "user_device_id")
    private String userDeviceId;
}
